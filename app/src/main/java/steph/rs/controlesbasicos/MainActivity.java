package steph.rs.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View view) {
        try {
            RadioGroup optOperaciones = (RadioGroup) findViewById(R.id.optOperaciones);
            Spinner cboOperaciones = (Spinner) findViewById(R.id.cboOperaciones);

            TextView tempval = (TextView) findViewById(R.id.txtNum1);
            double num1 = Double.parseDouble(tempval.getText().toString());

            tempval = (TextView) findViewById(R.id.txtNum2);
            double num2 = Double.parseDouble(tempval.getText().toString());

            double respuesta = 0;
            //Este es para el RadioGroup y los RadioButtons
            switch (optOperaciones.getCheckedRadioButtonId()) {
                case R.id.optSuma:
                    respuesta = num1 + num2;
                    break;
                case R.id.optResta:
                    respuesta = num1 - num2;
                    break;
                case R.id.optMultiplicacion:
                    respuesta = num1 * num2;
                    break;
                case R.id.optDivision:
                    respuesta = num1 / num2;
                    break;
                case R.id.optPorcentaje:
                    respuesta = (num1/num2)*num1;
                    break;
                case R.id.optExponenciacion:
                    respuesta = Math.pow(num1, num2);
                    break;
                case R.id.optModulo:
                    respuesta = num1%num2;
                    break;
                case R.id.optFactoreo:
                    long factorial= 3;
                    respuesta = num1*(num1+1)*(Math.pow(num2,2)-factorial);
                    break;

        }
            //Este es para el Spinner... -> ComboBox.
            switch (cboOperaciones.getSelectedItemPosition()){
                case 1: //suma
                    respuesta = num1 + num2;
                    break;
                case 2: //resta
                    respuesta = num1 - num2;
                    break;
                case 3: //multiplicacion
                    respuesta = num1 * num2;
                    break;
                case 4: //division
                    respuesta = num1 / num2;
                    break;
                case 5: //porcentaje
                    respuesta = (num1/num2)*num1;
                    break;
                case 6: //exponenciacion
                    respuesta = Math.pow(num1, num2);
                    break;
                case 7: //modulo
                    respuesta = num1%num2;
                    break;
                case 8: //factoreo
                    long factorial = 3;
                    respuesta = num1*(num1+1)*(Math.pow(num2,2)-factorial);
                    break;
            }
            tempval = (TextView) findViewById(R.id.lblRespuesta);
            tempval.setText("Respuesta: " + respuesta);
        }catch (Exception err){
            TextView temp = (TextView) findViewById(R.id.lblRespuesta);
            temp.setText("POR FAVOR INGRESAR LOS NÚMEROS CORRESPONDIENTES.");

           Toast.makeText(getApplicationContext(),"POR FAVOR INGRESAR LOS NÚMEROS.",Toast.LENGTH_LONG).show();
        }

    }
}