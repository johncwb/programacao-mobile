package com.example.ed_06

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val whatsAppButton = findViewById<Button>(R.id.openWhatsappButton)
        val exitButton = findViewById<Button>(R.id.closeAppButton)




        whatsAppButton.setOnClickListener {
            val number = "+5541995874180"
            val message = "Olá, boa tarde!!"
            val url = "https://wa.me/$number?text=${Uri.encode(message)}"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
//        whatsAppButton.setOnClickListener {
//            val uri = Uri.parse("smsto"+"+5541995874180")
//            val intent = Intent(Intent.ACTION_SENDTO,uri)
//            intent.setPackage("com.whatsapp")
//            if(intent.resolveActivity(this.packageManager) !=null ){
//                startActivity(intent)
//            }else{
//                Toast.makeText(this,"Package is not installed",Toast.LENGTH_SHORT).show()
//            } }


        exitButton.setOnClickListener {
            System.exit(0);
        }

    }
}