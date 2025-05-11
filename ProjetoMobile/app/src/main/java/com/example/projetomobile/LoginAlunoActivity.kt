import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomobile.R

class LoginAlunoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_aluno)

        val campoUsuario = findViewById<EditText>(R.id.editUsuarioAluno)
        val campoSenha = findViewById<EditText>(R.id.editSenhaAluno)
        val botaoEntrar = findViewById<Button>(R.id.btnEntrarAluno)

        botaoEntrar.setOnClickListener {
            val usuario = campoUsuario.text.toString()
            val senha = campoSenha.text.toString()

            // Simples verificação (só para exemplo)
            if (usuario.isNotEmpty() && senha.isNotEmpty()) {
                Toast.makeText(this, "Login do Aluno feito com sucesso!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
