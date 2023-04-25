package my.newapp.fsm.gpstracker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import my.newapp.fsm.gpstracker.databinding.ActivityMainBinding
import my.newapp.fsm.gpstracker.fragments.MainFragment
import my.newapp.fsm.gpstracker.fragments.SettingsFragment
import my.newapp.fsm.gpstracker.fragments.TracksFragment
import my.newapp.fsm.gpstracker.utils.openFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onClickBNav()
        openFragment(MainFragment.newInstance())
    }


    private fun onClickBNav() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.id_home -> openFragment(MainFragment.newInstance())
                R.id.id_tracks -> openFragment(TracksFragment.newInstance())
                R.id.id_settings -> openFragment(SettingsFragment())
            }
            true
        }
    }
}