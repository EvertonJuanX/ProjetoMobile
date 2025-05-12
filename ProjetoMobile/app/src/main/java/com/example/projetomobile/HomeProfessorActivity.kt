import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomobile.R

class HomeProfessorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_professor)

        val btnCriarEvento = findViewById<Button>(R.id.btnCriarEvento)
        btnCriarEvento.setOnClickListener {
            val intent = Intent(this, CriarEventoActivity::class.java)
            startActivity(intent)
        }
    }
}
