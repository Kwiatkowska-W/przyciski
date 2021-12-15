package xml.example.przyciski

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.przycisk).setOnClickListener {
        //    findViewById<Button>(R.id.przycisk).text="działa"
            findViewById<Button>(R.id.przycisk).text=findViewById<EditText>(R.id.wprowdztext).text
            findViewById<ImageView>(R.id.obrazek).rotationX=findViewById<EditText>(R.id.rotacjaX).text.toString().toFloat()
            findViewById<ImageView>(R.id.obrazek).scaleY=findViewById<EditText>(R.id.SkalaY).text.toString().toFloat()
            findViewById<ImageView>(R.id.obrazek).alpha=findViewById<EditText>(R.id.alpha).text.toString().toFloat()
        }
    }
}