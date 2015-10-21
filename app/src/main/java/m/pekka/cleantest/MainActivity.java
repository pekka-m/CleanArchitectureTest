package m.pekka.cleantest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import m.pekka.cleantest.R;

public class MainActivity extends AppCompatActivity {

    private EditText editText_radius;
    private TextView textView_result;
    private ShapePresenter shapePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
        Button button_createCircle = (Button) findViewById(R.id.button_createCircle);
        Button button_createBall = (Button) findViewById(R.id.button_createBall);
        Button button_getArea = (Button) findViewById(R.id.button_getArea);
        Button button_getCircumference = (Button) findViewById(R.id.button_getCircumference);
        Button button_getVolume = (Button) findViewById(R.id.button_getVolume);

        button_getArea.setOnClickListener(getArea);
        button_getCircumference.setOnClickListener(getCircumference);
        button_getVolume.setOnClickListener(getVolume);
        button_createCircle.setOnClickListener(createCircle);
        button_createBall.setOnClickListener(createBall);

        editText_radius = (EditText) findViewById(R.id.editText_radius);
        textView_result = (TextView) findViewById(R.id.textView_result);

        shapePresenter = new ShapePresenter();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private final View.OnClickListener createCircle = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (shapePresenter.createShape(Double.parseDouble(editText_radius.getText().toString()), "circle")) {
                textView_result.setText("Circle created.");
            }
            else {
                textView_result.setText("Something went wrong...");
            }
        }
    };

    private final View.OnClickListener createBall = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (shapePresenter.createShape(Double.parseDouble(editText_radius.getText().toString()), "ball")) {
                textView_result.setText("Ball created.");
            }
            else {
                textView_result.setText("Something went wrong...");
            }
        }
    };



    private final View.OnClickListener getArea = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView_result.setText("Area: " + Double.toString(shapePresenter.getArea()));
        }
    };

    private final View.OnClickListener getCircumference = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (shapePresenter.getCircumference() == -1) {
                textView_result.setText("No no no...");
            }
            else {
                textView_result.setText("Circumference: " + Double.toString(shapePresenter.getCircumference()));
            }
        }
    };

    private final View.OnClickListener getVolume = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (shapePresenter.getVolume() == -1) {
                textView_result.setText("No no no...");
            }
            else {
                textView_result.setText("Volume: " + Double.toString(shapePresenter.getVolume()));
            }
        }
    };
}
