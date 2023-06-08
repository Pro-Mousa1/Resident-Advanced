package com.example.residenthomes

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import de.hdodenhof.circleimageview.CircleImageView
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.util.*

class StudentProfileActivity : AppCompatActivity() {
    lateinit var profile: CircleImageView
    lateinit var editUsername:EditText
    lateinit var btnSave:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_profile)
        
        profile = findViewById(R.id.studentProfile)
        editUsername = findViewById(R.id.mEditUser)
        btnSave = findViewById(R.id.mBtnSave)
    }
}