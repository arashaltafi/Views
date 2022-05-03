package com.arash.altafi.views.kotlin.image5

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.arash.altafi.views.R
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView
import kotlinx.android.synthetic.main.activity_image_kotlin5.*


class ImageKotlinActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_kotlin5)

        init()
    }

    private fun init() {
        // start picker to get image for cropping and then use the image in cropping activity
        CropImage.activity().setGuidelines(CropImageView.Guidelines.ON).start(this)

//        val uri = Uri.parse("https://arashaltafi.ir/arash.jpg")
//        val bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)

        // start cropping activity for pre-acquired image saved on the device
//        CropImage.activity(uri).start(this)

        // for fragment (DO NOT use getActivity())
//        CropImage.activity().start(getContext(), this)

//        cropImageView.setImageUriAsync(uri)
        // or (prefer using uri for performance and better user experience)
//        cropImageView.setImageBitmap(bitmap)

        // subscribe to async event using cropImageView.setOnCropImageCompleteListener(listener)
//        cropImageView.getCroppedImageAsync()
        // or
//        val cropped = cropImageView.croppedImage
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        // handle result of CropImageActivity
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == RESULT_OK) {
                imageView_5.setImageURI(result.uri)
                Toast.makeText(this, "Cropping successful, Sample: " + result.sampleSize, Toast.LENGTH_LONG).show()
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Toast.makeText(this, "Cropping failed: " + result.error, Toast.LENGTH_LONG).show()
            }
        }
    }

}