package modulo_04.registro_usuario;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.function.Predicate;

public class MainActivity extends AppCompatActivity {
    EditText ed_nombres, ed_apellidos, ed_email, ed_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ed_nombres = (EditText) findViewById(R.id.ed_nombres);
        ed_apellidos = findViewById(R.id.ed_apellidos);
        ed_email = findViewById(R.id.ed_email);
        ed_pass = findViewById(R.id.ed_contraseña);

    }

    public void onClickCrear(View view){
        //ed_apellidos.setText(ed_nombres.getText());
        Boolean b_nom = ed_nombres.getText().toString().isBlank();
        Boolean b_ape = ed_apellidos.getText().toString().isBlank();
        Boolean b_eml = ed_email.getText().toString().isBlank();
        Boolean b_pas = ed_pass.getText().toString().isBlank();

        if (b_nom || b_ape || b_eml || b_pas ){
            Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_LONG).show();
        } else {
           Toast.makeText(this, "Registro completo", Toast.LENGTH_LONG).show();
        }


    }
}