package dao;

import java.util.List;

import dto.MemDTO;

public interface MemDAO {

	public List<MemDTO> list();
	public MemDTO list(int num);
	public MemDTO list(MemDTO dto);
	public void register(MemDTO dto);
	public void update(MemDTO dto);
	public void delete(int num);
}
