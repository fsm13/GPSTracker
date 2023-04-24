package my.newapp.fsm.gpstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import my.newapp.fsm.gpstracker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickBNav()
    }


    private fun onClickBNav() {
        binding.bNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.id_home -> {}
                R.id.id_tracks -> {}
                R.id.id_settings -> {}
            }
            true
        }
    }
}