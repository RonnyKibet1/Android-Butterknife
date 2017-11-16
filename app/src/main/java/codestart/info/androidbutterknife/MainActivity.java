package codestart.info.androidbutterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.name) EditText nameEditText;
    @BindView(R.id.email) EditText emailEditText;
    @BindView(R.id.result) TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind butterknife with this context
        ButterKnife.bind(this);


        //display results upon completion
        displayResults();

    }


    //configer button lister into method with butterknife
    @OnClick(R.id.button)
    public void displayResults() {
        String name = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();

        resultTextView.setText("Name: " + name + "\nEmail: " + email); //display result with a line break between each
    }

}
