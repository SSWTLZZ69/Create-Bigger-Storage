package uwu.lopyluna.create_bs.registry;

import com.simibubi.create.api.contraption.storage.item.MountedItemStorageType;
import com.tterrag.registrate.util.entry.RegistryEntry;
import uwu.lopyluna.create_bs.content.logistics.vault.TieredVaultMountedStorageType;

import java.util.function.Supplier;

import static uwu.lopyluna.create_bs.CreateBS.REGISTRATE;

public class BSMountedStorageTypes {
    public static final RegistryEntry<TieredVaultMountedStorageType> VAULT = simpleItem("tiered_vault", TieredVaultMountedStorageType::new);
    private static <T extends MountedItemStorageType<?>> RegistryEntry<T> simpleItem(String name, Supplier<T> supplier) {
        return REGISTRATE.mountedItemStorage(name, supplier).register();
    }

}
