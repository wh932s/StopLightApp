package com.example.stoplightv5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {





    //Variables for the Image and an array to house the two different pictures
    private static ImageView imgview;
    private int current_img;
    int[] images={R.drawable.redlight,R.drawable.greenlight,R.drawable.yellowlight};

    private static Button button;





    //Variables for the different textview portions
    ViewGroup container;
    TextView text1;
    TextView text2;
    TextView text3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





//Variables defined in the OnCreate Section
        buttonclick();




    }

    //The Application was stuck and wouldn't work until this part was added
    public void buttonclick()

    {



//More variables for the different images and textview section
//Defining the different Id's and setting initial visibility of text view
        imgview=(ImageView)findViewById(R.id.view1);
        button=(Button)findViewById(R.id.button);
        button.setText("Stop");

//Start of the onclick function
        button.setOnClickListener (
                new View.OnClickListener() {


                    @Override
                    public void onClick(View view) {



//If statement with different Visibilities for the Text View Elements
                        if (images[current_img] == R.drawable.redlight ) {

                            button.setBackgroundColor(button.getContext().getResources().getColor(R.color.green));
                            button.setText("Go");
                        }

                        if (images[current_img] == R.drawable.greenlight) {

                            button.setBackgroundColor(button.getContext().getResources().getColor(R.color.yellow));
                            button.setText("Wait");
                        }


                        else if (images[current_img] == R.drawable.yellowlight) {

                            button.setBackgroundColor(button.getContext().getResources().getColor(R.color.red));
                            button.setText("Stop");
                        }






//Code to make the image change back and forth between the different elephants
                        current_img++;

                        current_img = current_img % images.length;

                        imgview.setImageResource(images[current_img]);




                    }
                }
        );
    }
}




//First attempt to get visibility settings to work (Plan B)
//    public void onClick(View view) {
//
//    ImageView Image1 = (ImageView) findViewById(R.id.view1);
//    Image1.setVisibility(View.INVISIBLE);
//
//
//    ImageView Image2 = (ImageView) findViewById(R.id.view2);
//    Image2.setVisibility(View.VISIBLE);
//
//
//    }





