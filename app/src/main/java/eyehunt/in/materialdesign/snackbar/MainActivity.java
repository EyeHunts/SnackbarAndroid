package eyehunt.in.materialdesign.snackbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        Button btn_sneakbar = (Button) findViewById(R.id.btn_snackbar);
        btn_sneakbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(coordinatorLayout, "Welcome Eyehunt", Snackbar.LENGTH_LONG)
                        .setAction("Undo", new View.OnClickListener() {//On click Undo
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, " Undo ", Toast.LENGTH_LONG).show();
                            }
                        });
                snackbar.show();
            }
        });
    }
}
