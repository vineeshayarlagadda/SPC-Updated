package com.g3.spc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3.spc.entities.Fee;
import com.g3.spc.entities.FeeInstallment;
import com.g3.spc.entities.Student;
import com.g3.spc.exception.FeePaymentNotDoneException;
import com.g3.spc.repository.IFeeInstallmentRepository;
import com.g3.spc.repository.IFeeRepository;
@Service
public class IFeeInstallmentServiceImpl implements IFeeInstallmentService {
	@Autowired
	private IFeeInstallmentRepository repo1;
	
	
	@Override
	@Transactional
	public FeeInstallment makePayment(FeeInstallment feeInstallment) throws FeePaymentNotDoneException  {
		
		repo1.save(feeInstallment);
		double due = feeInstallment.getFee().getTotalFeesDue() - feeInstallment.getFeeInstallmentamt();
		feeInstallment.getFee().setTotalFeesDue(due);
		return feeInstallment;

	}
	
//student
	@Override
	public List<FeeInstallment> pendingInstallments(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FeeInstallment retrieveFeeInstallmentById(int id) {
		return repo1.findById(id).get();
		// TODO Auto-generated method stub
		
	}
//fee
	@Override
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee fee) {
		// TODO Auto-generated method stub
		return null;
	}

}
