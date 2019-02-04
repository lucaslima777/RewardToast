package reward.toast.lln;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RewardToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     * or {@link Activity} object.
     */
    public static int SUCCESS = 1;
    public static int WARNING = 2;
    public static int ERROR = 3;
    public static int INFO = 4;
    public static int DEFAULT = 5;
    public static int CONFUSING = 6;

    public RewardToast(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, String message, int duration, int type, boolean androidicon) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.reward_toast_layout, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.toast_type);
        ImageView img = (ImageView) layout.findViewById(R.id.toast_icon);
        ImageView img1 = (ImageView) layout.findViewById(R.id.imageView4);
        l1.setText(message);

        if (androidicon == true)
            img1.setVisibility(View.VISIBLE);
        else if (androidicon == false)
            img1.setVisibility(View.GONE);
        /*if (type == 1) {
            linearLayout.setBackgroundResource(R.drawable.success_shape);
            img.setImageResource(R.drawable.ic_check_black_24dp);
        } else if (type == 2) {
            linearLayout.setBackgroundResource(R.drawable.warning_shape);
            img.setImageResource(R.drawable.ic_pan_tool_black_24dp);
        } else if (type == 3) {
            linearLayout.setBackgroundResource(R.drawable.error_shape);
            img.setImageResource(R.drawable.ic_clear_black_24dp);
        } else if (type == 4) {
            linearLayout.setBackgroundResource(R.drawable.info_shape);
            img.setImageResource(R.drawable.ic_info_outline_black_24dp);
        } else if (type == 5) {
            linearLayout.setBackgroundResource(R.drawable.default_shape);
            img.setVisibility(View.GONE);
        } else if (type == 6) {
            linearLayout.setBackgroundResource(R.drawable.confusing_shape);
            img.setImageResource(R.drawable.ic_refresh_black_24dp);
        }*/
        toast.setGravity(Gravity.TOP | Gravity.CENTER, 0, 400);
        toast.setView(layout);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Teste", "onClick");
            }
        });

        return toast;
    }

}
