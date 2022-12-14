package com.example.snailpasswordmanager.presentation.login

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.snailpasswordmanager.PasswordApp
import com.example.snailpasswordmanager.R
import com.example.snailpasswordmanager.domain.model.UserEntity
import com.example.snailpasswordmanager.presentation.mainscreen.MainListActivity
import com.example.snailpasswordmanager.presentation.registration.RegistrationActivity
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.util.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    private lateinit var vm : LoginViewModel

    @Inject
    lateinit var vmFactory: LoginModelFactory


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        (applicationContext as PasswordApp).appComponent.inject(this)


        vm = ViewModelProvider(this,vmFactory)[LoginViewModel::class.java]

        val buttonLogion: Button = findViewById(R.id.l_login_button)
        val buttonRegistration: Button = findViewById(R.id.l_registration_button)


        val loginText: EditText = findViewById(R.id.login_text)
        val passwordText: EditText = findViewById(R.id.password_text)


        buttonLogion.setOnClickListener {
            val hashpass = vm.passwordHash(passwordText.text.toString())
            vm.logInEvent(
                UserEntity(
                    email = loginText.text.toString(),
                    password = hashpass,
                    hint = ""
                )
            );
        }
        vm.token
            .onEach {
                Log.d("test", "get token " + it.token)

                if(it.token != "-"){
                    val intent = Intent(this, MainListActivity::class.java)
                    finish()
                    startActivity(intent)
                }
            }
            .launchIn(lifecycleScope)
            /*
            CoroutineScope(Dispatchers.Main).launch {
                val bool = vm.logInEvent(
                        UserEntity(
                            email = loginText.text.toString(),
                            password = hashpass,
                            hint = null
                        )
                )
                if (bool) {
                    startActivity(intent)
                    finish()
                }
            }*/
        //}

        buttonRegistration.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java).apply {}
            startActivity(intent)
        }





    }


}