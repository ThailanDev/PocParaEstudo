package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var email: EditText
//    private lateinit var senha: EditText
//    private lateinit var button: Button
//    private lateinit var emailPreview: TextView
//    private lateinit var senhaPreview: TextView

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            login.setOnClickListener {
                chamadaApi(email.text.toString(), password.text.toString())
            }
        }



//
//        email = findViewById(R.id.email)
//        senha = findViewById(R.id.password)
//
//        emailPreview = findViewById(R.id.email_preview)
//        senhaPreview = findViewById(R.id.senha_preview)
//
//        button = findViewById(R.id.login)
//
//        button.setOnClickListener {
//            emailPreview.text = email.text
//            senhaPreview.text = senha.text
//            chamadaApi(email.text.toString(), senha.text.toString())
//        }
    }

    private fun chamadaApi(
        email: String,
        senha: String
    ) {
        if(email == "andre" && senha == "123"){
            Toast.makeText(this, "Login realizado com sucesso", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Login não realizado", Toast.LENGTH_SHORT).show()
        }

    }

}

