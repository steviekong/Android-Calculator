package com.example.sid_rk.background_color_changer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String number="";
    final Calculations calculations=new Calculations();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);

        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        Button b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);

        Button b4=(Button) findViewById(R.id.button4);
        b4.setOnClickListener(this);

        Button b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(this);

        Button b6=(Button) findViewById(R.id.button6);
        b6.setOnClickListener(this);

        Button b7=(Button) findViewById(R.id.button7);
        b7.setOnClickListener(this);

        Button b8=(Button) findViewById(R.id.button8);
        b8.setOnClickListener(this);

        Button b9=(Button) findViewById(R.id.button9);
        b9.setOnClickListener(this);

        Button b0=(Button) findViewById(R.id.button0);
        b0.setOnClickListener(this);

        Button bAdd=(Button) findViewById(R.id.buttonAdd);
        bAdd.setOnClickListener(this);

        Button bSub=(Button) findViewById(R.id.buttonSub);
        bSub.setOnClickListener(this);

        Button bDivide=(Button) findViewById(R.id.buttonDivide);
        bDivide.setOnClickListener(this);

        Button bMultiply=(Button) findViewById(R.id.buttonMulti);
        bMultiply.setOnClickListener(this);

        Button bPeriod=(Button) findViewById(R.id.buttonPeriod);
        bPeriod.setOnClickListener(this);

        Button bPlusMinus=(Button) findViewById(R.id.buttonPlusMinus);
        bPlusMinus.setOnClickListener(this);

        Button bClear=(Button) findViewById(R.id.buttonClear);
        bClear.setOnClickListener(this);

        Button bEquals=(Button) findViewById(R.id.buttonEquals);
        bEquals.setOnClickListener(this);

        final TextView text=(TextView) findViewById(R.id.textView);
        text.setText("0");
    }
    @Override
    public void onClick(View view){
        final TextView text=(TextView) findViewById(R.id.textView);
        switch (view.getId()){
            case R.id.button0:
                number = number + '0';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button1:
                number=number+'1';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button2:
                number=number+'2';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button3:
                number=number+'3';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button4:
                number=number+'4';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button5:
                number=number+'5';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button6:
                number=number+'6';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button7:
                number=number+'7';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button8:
                number=number+'8';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.button9:
                number=number+'9';
                calculations.numInput(number);
                text.setText(calculations.numDisplay());
                break;
            case R.id.buttonAdd:
                if(number!="") {
                    calculations.operationsInput('+');
                    number = "";
                    text.setText(calculations.numDisplay());
                }
                break;
            case R.id.buttonDivide:
                if(number!="") {
                    calculations.operationsInput('/');
                    number = "";
                    text.setText(calculations.numDisplay());
                }
                break;
            case R.id.buttonSub:
                if(number!="") {
                    calculations.operationsInput('-');
                    number = "";
                    text.setText(calculations.numDisplay());
                }
                break;
            case R.id.buttonMulti:
                if(number!="") {
                    calculations.operationsInput('*');
                    number = "";
                    text.setText(calculations.numDisplay());
                }
                break;
            case R.id.buttonPeriod:
                if(!number.contains(".")&&number!="") {
                    number = number + '.';
                    calculations.numInput(number);
                    text.setText(calculations.numDisplay());
                }
                else {
                    number="0.";
                    calculations.numInput(number);
                    text.setText("0.0");
                }
                break;
            case R.id.buttonPlusMinus:
                if(number==""){
                    break;
                }else {
                    number = Double.toString(Double.parseDouble(number) * -1);
                    calculations.numInput(number);
                    text.setText(calculations.numDisplay());
                    break;
                }
            case R.id.buttonEquals:
                String finalNum=calculations.calculator();
                text.setText(finalNum);
                calculations.clearAndReset();
                number="";
                break;
            case R.id.buttonClear:
                calculations.clearAndReset();
                number="";
                text.setText(calculations.numDisplay());
                break;
        }
    }


}
