package xml.example.przyciski

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.przycisk).setOnClickListener {
        //    findViewById<Button>(R.id.przycisk).text="działa"
            findViewById<Button>(R.id.przycisk).text=findViewById<EditText>(R.id.wprowdztext).text
        }
    }
}