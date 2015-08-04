package com.example.text_to_speech;

import java.util.Locale;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.TextToSpeech.OnInitListener;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity implements OnInitListener {

	TextToSpeech TTS;
	Button btn1, btn2, btn3, btn4;
	
	@Override
    protected void onCreate(Bundle savedInstanceState){
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.activity_main);
    	
    	TTS = new TextToSpeech(MainActivity.this, MainActivity.this);
    	btn1 = (Button) findViewById(R.id.btnSpring);
    	btn2 = (Button) findViewById(R.id.btnSummer);
    	btn3 = (Button) findViewById(R.id.btnAutumn);
    	btn4 = (Button) findViewById(R.id.btnWinter);
    	btn1.setOnClickListener(new OnClickListener(){
    	
    		@Override
    		public void onClick(View v){
    			TTS.speak("Spring", TextToSpeech.QUEUE_ADD,null);
    		}
    		
    	});
    	
    	btn2.setOnClickListener(new OnClickListener(){
        	
    		@Override
    		public void onClick(View v){
    			TTS.speak("Summer", TextToSpeech.QUEUE_ADD,null);
    		}
    		
    	});
    	
    	btn3.setOnClickListener(new OnClickListener(){
        	
    		@Override
    		public void onClick(View v){
    			TTS.speak("Autumn", TextToSpeech.QUEUE_ADD,null);
    		}
    		
    	});
    	
    	btn4.setOnClickListener(new OnClickListener(){
        	
    		@Override
    		public void onClick(View v){
    			TTS.speak("Winter", TextToSpeech.QUEUE_ADD,null);
    		}
    		
    	});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    
    public void onInit(int status){
    	TTS.setLanguage(Locale.ENGLISH);
    }

}
