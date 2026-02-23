package tech.isaacmota.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.isaacmota.picpay.entity.Wallet;
import tech.isaacmota.picpay.entity.WalletType;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
