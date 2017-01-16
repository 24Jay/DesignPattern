package mvc;

public interface BeatModelInterface
{
	void initialize();
	
	void on();
	void off();
	void setBPM();
	int getBPM();
	void registerOberver(BeatOberver ob);
	void removeOberver(BeatOberver ob);
	void registerOberber(BPMOberver ob);
	void removeOberver(BPMOberver ob);
	
}
