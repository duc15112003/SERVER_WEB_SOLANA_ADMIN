package com.solana.main.mapper;

import com.solana.main.dto.AccountDTO;
import com.solana.main.model.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

<<<<<<< HEAD
import java.util.List;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    AccountDTO accountToAccountDTO(Account Account);
    Account accountDTOToAccount(AccountDTO AccountDto);
    List<Account> listAccountDTOToListAccount(List<AccountDTO> listAccountDTO);
    List<AccountDTO> listAccountToListAccountDTO(List<Account> listAccount);
=======
@Mapper
public interface AccountMapper{
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);
    AccountDTO accountToAccountDTO(Account account);
    Account accountDTOToAccount(AccountDTO accountDTO);

>>>>>>> origin/dev-duc
}
