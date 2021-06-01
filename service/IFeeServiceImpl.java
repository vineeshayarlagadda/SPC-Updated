//package com.g3.spc.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.g3.spc.entities.Fee;
//import com.g3.spc.entities.Student;
//import com.g3.spc.repository.IFeeRepository;
//
//@Service
//public class IFeeServiceImpl implements IFeeService{
//	@Autowired
//	private IFeeRepository feeRepo;	
//
//	@Override
//	public Fee addFee(Fee fee) {
//		feeRepo.save(fee);
//		// TODO Auto-generated method stub
//		return fee;
//	}
//
//	@Override
//	public Fee deleteFee(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Fee updateFee(Fee fee) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Fee retrieveFee(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Fee retrieveFeeByStudent(Student student) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Fee> retrieveAllFeeByMonth(int month) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	
//	
//	
//
//}


package com.g3.spc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3.spc.entities.Fee;
import com.g3.spc.entities.FeeInstallment;
import com.g3.spc.entities.Student;
import com.g3.spc.repository.IFeeRepository;
@Service
public class IFeeServiceImpl implements IFeeService {

	@Autowired
	private IFeeRepository repo;	
	
	
	
	public IFeeServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



	public IFeeServiceImpl(IFeeRepository repo) {
		super();
		this.repo = repo;
	}



	@Override
	@Transactional
	public Fee addFee(Fee fee) {
		repo.save(fee);
		
	//	double due = fee.getTotalFees() - fee.getFeeInstallment();
	//	feeInstallment.getFee().setTotalFeesDue(due);
		
	//	double py = fee.getTotalFees();
		
		//double p = fee.getFeeinstallment(f);
		//fee.setTotalFeesReceived(py);;
		// TODO Auto-generated method stub
		return fee;
	}
	@Override
	@Transactional
	public Fee deleteFee(Fee fee){
		int id = fee.getFeeId();
		Optional<Fee> a = repo.findById(id);
		repo.delete(fee);
		
		// TODO Auto-generated method stub
		return fee;
	}
	
	@Override
	public Fee updateFee(Fee fee) {
		Optional<Fee> fp = repo.findById(fee.getFeeId()); 
		Fee f = repo.findById(fee.getFeeId()).get();
		if(f != null) {
			f.setTotalFeesDue(fee.getTotalFeesDue());
			f.setTotalFeesReceived(fee.getTotalFeesReceived());
			f.setFeeinstallment(fee.getFeeinstallment());
			f.setTotalFees(fee.getTotalFees());
		}
		return repo.save(f);
		
		// TODO Auto-generated method stub
	}
	
	@Override
	public Fee retrieveFee(int id) {
		Optional<Fee> f = repo.findById(id);
		return repo.findById(id).get();
		// TODO Auto-generated method stub
	//	return null;
	}
	

	@Override()
	public List<Fee> retrieveAllFeeByMonth(int month) {
		List<Fee> feelist = new ArrayList<>();
		List<Fee> f1 = repo.findAll();
		 
		for(Fee f:f1) {
			List<FeeInstallment> installmentlist = f.getFeeinstallment();
			for(FeeInstallment i:installmentlist) {	
			
				if (i.getFeePaymentDate().getMonth().getValue() == month)
					feelist.add(f);
			//System.out.println(f.getFeeinstallment().getFeePaymentDate().getMonth().getValue());
			}	
			
		}
		// TODO Auto-generated method stub
		return feelist;
	}
	/*
	@Override
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee fee) {
		int id = fee.getFeeId();
		
		// TODO Auto-generated method stub
		return null;
	}
*/
	@Override
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee fee) {	
		List<FeeInstallment> fi = new ArrayList<>();
		List<Fee> fi1 = repo.findAll();
		for(Fee f:fi1) {
			if(f.getFeeinstallment() == fee.getFeeinstallment() ) {
				fi.addAll(f.getFeeinstallment());
			}
		}
		// TODO Auto-generated method stub
		return fee.getFeeinstallment();
		}



	@Override
	public Fee retrieveFeeByStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}





















