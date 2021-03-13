package oopsDesign;

import java.util.List;

public interface Facilities {
    public Library setLibrary();
    public void setMusicRoom();
    public void setLAB();
    public Staff getOldestMember(List<Staff> staff);

}
