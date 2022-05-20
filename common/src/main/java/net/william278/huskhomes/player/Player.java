package net.william278.huskhomes.player;

import de.themoep.minedown.MineDown;
import net.william278.huskhomes.position.Position;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * A cross-platform representation of a player
 */
public interface Player {

    /**
     * Return the player's name
     *
     * @return the player's name
     */
    String getName();

    /**
     * Return the player's {@link UUID}
     *
     * @return the player {@link UUID}
     */
    UUID getUuid();

    /**
     * Returns the current {@link Position} of this player
     *
     * @return the player's current {@link Position}
     */
    Position getPosition();

    /**
     * Returns if the player has the permission node
     *
     * @param node The permission node string
     * @return {@code true} if the player has the node; {@code false} otherwise
     */
    boolean hasPermission(@NotNull String node);

    /**
     * Dispatch a MineDown-formatted message to this player
     *
     * @param mineDown the parsed {@link MineDown} to send
     */
    void sendMessage(@NotNull MineDown mineDown);

    /**
     * Returns the maximum number of homes this player can set
     *
     * @return a {@link CompletableFuture} providing the max number of homes this player can set
     */
    CompletableFuture<Integer> getMaxHomes();

    /**
     * Returns the number of homes this player can set for free
     *
     * @return a {@link CompletableFuture} providing the max number of homes this player can set
     */
    CompletableFuture<Integer> getFreeHomes();

}