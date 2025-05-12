import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomobile.R

class ListaEventosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_eventos)

        val btnInscrever = findViewById<Button>(R.id.btnInscrever)
        btnInscrever.setOnClickListener {
            Toast.makeText(this, "Inscrição realizada com sucesso!", Toast.LENGTH_SHORT).show()
        }
    }
}
