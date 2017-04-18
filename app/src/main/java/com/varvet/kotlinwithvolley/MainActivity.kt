package com.varvet.kotlinwithvolley

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById(R.id.request_button).setOnClickListener {
            val service = ServiceVolley()
            val apiController = APIController(service)

            val path = "example_endpoint"
            val params = JSONObject()
            params.put("email", "foo@email.com")
            params.put("password", "barpass")

            apiController.post(path, params) { response ->
                // Parse the result
            }
        }
    }
}