package kr.go.molab.model;

import java.util.List;

import kr.go.molab.dto.SampleDTO;

public interface SampleDAO {
	public List<SampleDTO> sampleList() throws Exception;
	public SampleDTO getSample(String id) throws Exception;
	public void addSample(SampleDTO sample) throws Exception;
}
