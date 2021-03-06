/*
 *     This file is part of Discord4J.
 *
 *     Discord4J is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Discord4J is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */

package sx.blah.discord.handle.impl.events;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.api.events.Event;

/**
 * Dispatched when all shards have received all available guilds. This means that a
 * {@link sx.blah.discord.handle.impl.events.shard.ShardReadyEvent} has been fired for each shard.
 *
 * @see IDiscordClient#isReady()
 */
public class ReadyEvent extends Event {

}
