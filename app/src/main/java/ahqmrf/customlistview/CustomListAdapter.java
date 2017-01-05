package ahqmrf.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
/**
 * Created by ahqmrf on 1/5/2017.
 */

public class CustomListAdapter extends ArrayAdapter<User> {
    ArrayList<User> users;
    int resource;
    Context context;

    public CustomListAdapter(Context context, int resource, ArrayList<User> objects) {
        super(context, resource, objects);
        this.resource = resource;
        this.context = context;
        this.users = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_layout, null, true);
        }

        User user = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewUser);
        Picasso.with(context).load(user.getTitlePhoto()).into(imageView);

        TextView tvHandle = (TextView) convertView.findViewById(R.id.tvHandle);
        tvHandle.setText(user.getHandle());

        TextView tvRating = (TextView) convertView.findViewById(R.id.tvRating);
        tvRating.setText("" + user.getRating());

        TextView tvLastOnline = (TextView) convertView.findViewById(R.id.tvLastOnline);
        tvLastOnline.setText("" + user.getLastOnline());

        return convertView;
    }
}
