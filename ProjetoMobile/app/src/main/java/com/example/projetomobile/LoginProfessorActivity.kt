import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projetomobile.R

class LoginProfessorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_professor)

        val campoUsuario = findViewById<EditText>(R.id.editUsuarioProf)
        val campoSenha = findViewById<EditText>(R.id.editSenhaProf)
        val botaoEntrar = findViewById<Button>(R.id.btnEntrarProf)

        botaoEntrar.setOnClickListener {
            val usuario = campoUsuario.text.toString()
            val senha = campoSenha.text.toString()

            if (usuario.isNotEmpty() && senha.isNotEmpty()) {
                Toast.makeText(this, "Login do Professor feito com sucesso!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
