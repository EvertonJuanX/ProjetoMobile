import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomobile.R

class CriarEventoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_criar_evento)

        val btnSalvar = findViewById<Button>(R.id.btnSalvarEvento)

        btnSalvar.setOnClickListener {
            val nome = findViewById<EditText>(R.id.etNomeEvento).text.toString()
            val descricao = findViewById<EditText>(R.id.etDescricao).text.toString()
            val data = findViewById<EditText>(R.id.etData).text.toString()
            val local = findViewById<EditText>(R.id.etLocal).text.toString()
            val tipo = findViewById<EditText>(R.id.etTipo).text.toString()

            if (nome.isNotEmpty() && descricao.isNotEmpty() && data.isNotEmpty() && local.isNotEmpty() && tipo.isNotEmpty()) {
                Toast.makeText(this, "Evento salvo com sucesso!", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
