package criminalintent.android.bignerdranch.com.criminalintent;

import java.util.UUID;

/**
 * @author kshen
 * @since 10/4/17.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public UUID getId() {
        return mId;
    }
}
