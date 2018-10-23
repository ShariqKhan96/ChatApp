package android.webinnovatives.com.chatapp.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webinnovatives.com.chatapp.R;
import android.widget.TextView;

import com.github.library.bubbleview.BubbleTextView;

public class ChatViewHolder extends RecyclerView.ViewHolder {

    public TextView messageUserName, messageTime, message;

    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);

        messageUserName = itemView.findViewById(R.id.message_user);
        messageTime = itemView.findViewById(R.id.message_time);
        message = (BubbleTextView) itemView.findViewById(R.id.message_text);

    }
}
