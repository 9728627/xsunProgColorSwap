package html.eduhollcs184assignmentsassignment1.ucsb.cs.httpwww.xsunprogcolorswap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.graphics.Color;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        Button myButton = new Button(this);

        myButton.setText("TAP ME!");

        RelativeLayout myLayout = new RelativeLayout(this);
        //myLayout.setBackgroundColor(Color.WHITE);

        RelativeLayout.LayoutParams buttonParams =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        buttonParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        //buttonParams.addRule();
        //buttonParams.addRule(RelativeLayout.CENTER_VERTICAL);
        //myLayout.addView(myButton, buttonParams);

        //EditText myEditText = new EditText(this);
        myButton.setId(1);
        //myEditText.setId(2);

        //myEditText.setText("color is here");
        final TextView colorRGB = new TextView(this);
        /*colorRGB.setLayoutParams(
                new RelativeLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );*/
        colorRGB.setId(2);

        colorRGB.setText("Tap to Change Color");
        colorRGB.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22);

        RelativeLayout.LayoutParams textParams =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );
        textParams.addRule(RelativeLayout.ABOVE, myButton.getId());
        textParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        textParams.setMargins(0, 80, 0, 30);
        colorRGB.setY(180);
        //textParams.set
        myButton.setY(200);


        myLayout.addView(myButton, buttonParams);
        myLayout.addView(colorRGB, textParams);
        setContentView(myLayout);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int R = (int)(Math.random()*256);
                int G = (int)(Math.random()*256);
                int B = (int)(Math.random()*256);


                colorRGB.setText("COLOR: " + R +"r "+ G +"g "+ B + "b");
                colorRGB.setTextColor(Color.rgb(R,G,B));
            }
        });


    }
}




