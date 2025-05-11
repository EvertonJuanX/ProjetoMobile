import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomobile.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAluno = findViewById<Button>(R.id.btnAluno)
        val btnProfessor = findViewById<Button>(R.id.btnProfessor)

        btnAluno.setOnClickListener {
            val intent = Intent(this, LoginAlunoActivity::class.java)
            startActivity(intent)
        }

        btnProfessor.setOnClickListener {
            val intent = Intent(this, LoginProfessorActivity::class.java)
            startActivity(intent)
        }
    }
}
