import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomobile.R

class HomeAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_aluno)

        val btnInscrever = findViewById<Button>(R.id.btnInscrever)
        btnInscrever.setOnClickListener {
            val intent = Intent(this, ListaEventosActivity::class.java)
            startActivity(intent)
        }
    }
}
