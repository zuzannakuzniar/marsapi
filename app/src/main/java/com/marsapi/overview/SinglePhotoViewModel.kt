package com.example.android.marsphotos.overview

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.marsphotos.R


class SinglePhotoViewModel : ViewModel(){

    private val _status = MutableLiveData<MarsApiStatus>()

    private fun getPhoto() {
        val singlePhoto = R.id.single_Photo;

        val bundle = Bundle()
        bundle.putSerializable("images", imageList)
        bundle.putInt("position", position)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val galleryFragment = GalleryFullscreenFragment()
        galleryFragment.setArguments(bundle)
        galleryFragment.show(fragmentTransaction, "gallery")


    }
}