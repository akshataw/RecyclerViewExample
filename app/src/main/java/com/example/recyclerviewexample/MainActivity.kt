package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users = mutableListOf<User>(
            User("Akshata", "Waghe", R.drawable.girls2),
            User("Pradnya", "Dalvi", R.drawable.girl),
            User("Shraddha", "Kudalkar", R.drawable.girl),
            User("Snehal", "Narkar", R.drawable.girls2),
            User("Nisha", "Joshi", R.drawable.girls2),
            User("Shreya", "Ghate", R.drawable.girl),
            User("Mandar", "Waghe", R.drawable.boy),
            User("Aniket", "Kambli", R.drawable.boy)
        )
//        for (i in 0..100) {
//            users.add(User("Akshata #$i", "Waghe"))
//        }

//        val userData = mutableListOf<User>()

//        for(element in users) {
//            userData.add(User(element.firstName, element.lastName))
//        }

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = UsersAdapter(users)
        }
    }
}