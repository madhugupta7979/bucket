package com.example.floydpo;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;



public class startpage extends Activity {
static int l=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game);
		final Random r=new Random();
	      int[][] d=new int[20][20];
		final int bk[][]=new int[20][20];
		final Button b=(Button)findViewById(R.id.button1)	;
		final Button submit=(Button)findViewById(R.id.button10)	;
		final Button b1=(Button)findViewById(R.id.button2)	;
		final Button b2=(Button)findViewById(R.id.button3)	;
		final Button b3=(Button)findViewById(R.id.button4)	;
		final Button b4=(Button)findViewById(R.id.button5)	;
		final Button b5=(Button)findViewById(R.id.button6)	;
		final Button b6=(Button)findViewById(R.id.button7)	;
		final Button b7=(Button)findViewById(R.id.button8)	;
		final Button b8=(Button)findViewById(R.id.button9)	;
		
		b.setText(Integer.toString(r.nextInt(20)+1));
		b1.setText(Integer.toString(r.nextInt(20)+1));
		b2.setText(Integer.toString(r.nextInt(20)+1));
		b3.setText(Integer.toString(r.nextInt(20)+1));
		b4.setText(Integer.toString(r.nextInt(20)+1));
		b5.setText(Integer.toString(r.nextInt(20)+1));
		b6.setText(Integer.toString(r.nextInt(20)+1));
		b7.setText(Integer.toString(r.nextInt(20)+1));
		b8.setText(Integer.toString(r.nextInt(20)+1));
		bk[0][0]=Integer.parseInt((String)b3.getText());
		bk[0][1]= Integer.parseInt((String)b4.getText());
		bk[0][2]=Integer.parseInt((String) b5.getText());
		bk[1][0]=Integer.parseInt((String) b1.getText());
		bk[1][1]=Integer.parseInt((String) b.getText());
		bk[1][2]=Integer.parseInt((String) b2.getText());
		bk[2][0]=Integer.parseInt((String) b6.getText());
		bk[2][1]=Integer.parseInt((String) b7.getText());
		bk[2][2]=Integer.parseInt((String) b8.getText());
		d[0][0]=0;
		d[0][1]=bk[0][0]+bk[0][1];
		d[0][2]=9999;
		d[0][3]=bk[0][0]+bk[0][3];
		d[0][4]=9999;
		d[0][5]=9999;
		d[0][6]=9999;
		d[0][7]=9999;
		d[0][8]=9999;
		d[1][0]=bk[0][0]+bk[0][1];
		d[1][1]=0;
		d[1][2]=bk[0][2]+bk[0][1];
		d[1][3]=9999;
		d[1][4]=bk[1][1]+bk[0][1];
		d[1][5]=9999;
		d[1][6]=9999;
		d[1][7]=9999;
		d[1][8]=9999;
		d[2][0]=9999;
		d[2][1]=bk[0][2]+bk[0][1];
		d[2][2]=0;
		d[2][3]=9999;
		d[2][4]=9999;
		d[2][5]=bk[0][2]+bk[1][2];
		d[2][6]=9999;
		d[2][7]=9999;
		d[2][8]=9999;
		d[3][0]=bk[0][0]+bk[1][0];
		d[3][1]=9999;
		d[3][2]=9999;
		d[3][3]=0;
		d[3][4]=bk[1][0]+bk[1][1];
		d[3][5]=9999;
		d[3][6]=bk[1][0]+bk[2][0];
		d[3][7]=9999;
		d[3][8]=9999;
		d[4][0]=9999;
		d[4][1]=bk[1][1]+bk[0][1];
		d[4][2]=9999;
		d[4][3]=bk[1][0]+bk[1][1];
		d[4][4]=0;
		d[4][5]=bk[1][1]+bk[1][2];
		d[4][6]=9999;
		d[4][7]=bk[1][1]+bk[2][1];
		d[4][8]=9999;
		d[5][0]=9999;
		d[5][1]=9999;
		d[5][2]=bk[0][2]+bk[1][2];
		d[5][3]=9999;
		d[5][4]=bk[1][1]+bk[1][2];
		d[5][5]=0;
		d[5][6]=9999;
		d[5][7]=9999;
		d[5][8]=bk[1][2]+bk[2][2];
		d[6][0]=9999;
		d[6][1]=9999;
		d[6][2]=9999;
		d[6][3]=bk[1][0]+bk[2][0];
		d[6][4]=9999;
		d[6][5]=9999;
		d[6][6]=0;
		d[6][7]=bk[2][0]+bk[2][1];
		d[6][8]=9999;
		d[7][0]=9999;
		d[7][1]=9999;
		d[7][2]=9999;
		d[7][3]=9999;
		d[7][4]=bk[1][1]+bk[2][1];
		d[7][5]=9999;
		d[7][6]=bk[2][0]+bk[2][1];
		d[7][7]=0;
		d[7][8]=bk[2][1]+bk[2][2];
		d[8][0]=9999;
		d[8][1]=9999;
		d[8][2]=9999;
		d[8][3]=9999;
		d[8][4]=9999;
		d[8][5]=bk[1][2]+bk[2][2];
		d[8][6]=9999;
		d[8][7]=bk[2][1]+bk[2][2];
		d[8][8]=0;
		
		
	for(int k=0;k<9;k++) 
		for(int i=0;i<9;i++)
		        for(int j=0;j<9;j++)
		        	d[i][j]=(d[i][j]<(d[i][k]+d[k][j]))?d[i][j]:(d[i][k]+d[k][j]);

	final int temp=d[6][2];        
	          
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				b.setBackgroundColor(Color.RED);
				l=l+2*(bk[1][1]);
				
			}
		});
       b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				b1.setBackgroundColor(Color.RED);
				l=l+2*(bk[1][0]);
				
			}
		});
       b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				b2.setBackgroundColor(Color.RED);
				l=l+2*(bk[1][2]);
				
				
			}
		});
       b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				b3.setBackgroundColor(Color.RED);
				l=l+2*(bk[0][0]);
				
			}
		});
       b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				b4.setBackgroundColor(Color.RED);
				l=l+2*(bk[0][1]);
				
			}
		});
       b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public  void onClick(View v) {
				
				b5.setBackgroundColor(Color.RED);
				l=l+(bk[0][2]);
				/*if(l==temp)
			       {
			    	  // startActivity(new Intent(MainActivity.this, Second.class));
					 Intent i=new Intent(this,Second.class);
					 startActivity();
			       }*/
			      

				
			}
		});
       b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				b6.setBackgroundColor(Color.RED);
				l=l+(bk[2][0]);
				
			}
		});
       b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				b7.setBackgroundColor(Color.RED);
				l=l+2*(bk[2][1]);
				
			}
		});
       b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				b8.setBackgroundColor(Color.RED);
				l=l+2*(bk[2][2]);
				
			}
		});
      submit.setOnClickListener(new OnClickListener() {
    	  
		
		@Override
		public void onClick(View v) {
			
			if(l>temp)
			{
				// startActivity(new Intent(MainActivity,this,Second.class));
				Intent i=new Intent(startpage.this,Third.class);
				 startActivity(i);
			       
			}
			else
			{
				Intent i=new Intent(startpage.this,Second.class);
				 startActivity(i);
			}
			
		}
	});




	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
