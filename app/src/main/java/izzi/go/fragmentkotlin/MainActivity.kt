package izzi.go.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var content: FrameLayout? = null

    private val bottomNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when(item.itemId){
            R.id.nav_home -> {
                val fragment = HomeFrag.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_percen -> {
                val fragment = CallFrag()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_history -> {
                val fragment = HistoryFrag()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_Profile -> {
                val fragment = ProfileFrag()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }



        }
        false
    }

    private fun addFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, fragment,fragment.javaClass.getSimpleName())
            .commit()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navigationView : BottomNavigationView = findViewById(R.id.navigation)
        navigationView.setOnNavigationItemSelectedListener(bottomNavigationItemSelectedListener)
        val fragment = HomeFrag.newInstance()
        addFragment(fragment)




    }
}