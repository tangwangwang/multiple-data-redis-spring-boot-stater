package com.tangwangwang.redis.core;

import org.springframework.data.redis.connection.DataType;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.core.query.SortQuery;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.data.redis.hash.HashMapper;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.io.Closeable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public interface MultipleRedisOperations extends RedisOperations<Object, Object> {

    @Override
    default <T> T execute(RedisCallback<T> action) {
        return null;
    }

    @Override
    default <T> T execute(SessionCallback<T> session) {
        return null;
    }

    @Override
    default List<Object> executePipelined(RedisCallback<?> action) {
        return null;
    }

    @Override
    default List<Object> executePipelined(RedisCallback<?> action, RedisSerializer<?> resultSerializer) {
        return null;
    }

    @Override
    default List<Object> executePipelined(SessionCallback<?> session) {
        return null;
    }

    @Override
    default List<Object> executePipelined(SessionCallback<?> session, RedisSerializer<?> resultSerializer) {
        return null;
    }

    @Override
    default <T> T execute(RedisScript<T> script, List<Object> keys, Object... args) {
        return null;
    }

    @Override
    default <T> T execute(RedisScript<T> script, RedisSerializer<?> argsSerializer, RedisSerializer<T> resultSerializer, List<Object> keys, Object... args) {
        return null;
    }

    @Override
    default <T extends Closeable> T executeWithStickyConnection(RedisCallback<T> callback) {
        return null;
    }

    @Override
    default Boolean copy(Object sourceKey, Object targetKey, boolean replace) {
        return null;
    }

    @Override
    default Boolean hasKey(Object key) {
        return null;
    }

    @Override
    default Long countExistingKeys(Collection<Object> keys) {
        return null;
    }

    @Override
    default Boolean delete(Object key) {
        return null;
    }

    @Override
    default Long delete(Collection<Object> keys) {
        return null;
    }

    @Override
    default Boolean unlink(Object key) {
        return null;
    }

    @Override
    default Long unlink(Collection<Object> keys) {
        return null;
    }

    @Override
    default DataType type(Object key) {
        return null;
    }

    @Override
    default Set<Object> keys(Object pattern) {
        return null;
    }

    @Override
    default Cursor<Object> scan(ScanOptions options) {
        return null;
    }

    @Override
    default Object randomKey() {
        return null;
    }

    @Override
    default void rename(Object oldKey, Object newKey) {

    }

    @Override
    default Boolean renameIfAbsent(Object oldKey, Object newKey) {
        return null;
    }

    @Override
    default Boolean expire(Object key, long timeout, TimeUnit unit) {
        return null;
    }

    @Override
    default Boolean expireAt(Object key, Date date) {
        return null;
    }

    @Override
    default Boolean persist(Object key) {
        return null;
    }

    @Override
    default Boolean move(Object key, int dbIndex) {
        return null;
    }

    @Override
    default byte[] dump(Object key) {
        return new byte[0];
    }

    @Override
    default void restore(Object key, byte[] value, long timeToLive, TimeUnit unit, boolean replace) {

    }

    @Override
    default Long getExpire(Object key) {
        return null;
    }

    @Override
    default Long getExpire(Object key, TimeUnit timeUnit) {
        return null;
    }

    @Override
    default List<Object> sort(SortQuery<Object> query) {
        return null;
    }

    @Override
    default <T> List<T> sort(SortQuery<Object> query, RedisSerializer<T> resultSerializer) {
        return null;
    }

    @Override
    default <T> List<T> sort(SortQuery<Object> query, BulkMapper<T, Object> bulkMapper) {
        return null;
    }

    @Override
    default <T, S> List<T> sort(SortQuery<Object> query, BulkMapper<T, S> bulkMapper, RedisSerializer<S> resultSerializer) {
        return null;
    }

    @Override
    default Long sort(SortQuery<Object> query, Object storeKey) {
        return null;
    }

    @Override
    default void watch(Object key) {

    }

    @Override
    default void watch(Collection<Object> keys) {

    }

    @Override
    default void unwatch() {

    }

    @Override
    default void multi() {

    }

    @Override
    default void discard() {

    }

    @Override
    default List<Object> exec() {
        return null;
    }

    @Override
    default List<Object> exec(RedisSerializer<?> valueSerializer) {
        return null;
    }

    @Override
    default List<RedisClientInfo> getClientList() {
        return null;
    }

    @Override
    default void killClient(String host, int port) {

    }

    @Override
    default void slaveOf(String host, int port) {

    }

    @Override
    default void slaveOfNoOne() {

    }

    @Override
    default void convertAndSend(String destination, Object message) {

    }

    @Override
    default ClusterOperations<Object, Object> opsForCluster() {
        return null;
    }

    @Override
    default GeoOperations<Object, Object> opsForGeo() {
        return null;
    }

    @Override
    default BoundGeoOperations<Object, Object> boundGeoOps(Object key) {
        return null;
    }

    @Override
    default <HK, HV> HashOperations<Object, HK, HV> opsForHash() {
        return null;
    }

    @Override
    default <HK, HV> BoundHashOperations<Object, HK, HV> boundHashOps(Object key) {
        return null;
    }

    @Override
    default HyperLogLogOperations<Object, Object> opsForHyperLogLog() {
        return null;
    }

    @Override
    default ListOperations<Object, Object> opsForList() {
        return null;
    }

    @Override
    default BoundListOperations<Object, Object> boundListOps(Object key) {
        return null;
    }

    @Override
    default SetOperations<Object, Object> opsForSet() {
        return null;
    }

    @Override
    default BoundSetOperations<Object, Object> boundSetOps(Object key) {
        return null;
    }

    @Override
    default <HK, HV> StreamOperations<Object, HK, HV> opsForStream() {
        return null;
    }

    @Override
    default <HK, HV> StreamOperations<Object, HK, HV> opsForStream(HashMapper<? super Object, ? super HK, ? super HV> hashMapper) {
        return null;
    }

    @Override
    default <HK, HV> BoundStreamOperations<Object, HK, HV> boundStreamOps(Object key) {
        return null;
    }

    @Override
    default ValueOperations<Object, Object> opsForValue() {
        return null;
    }


    @Override
    default BoundValueOperations<Object, Object> boundValueOps(Object key) {
        return null;
    }

    @Override
    default ZSetOperations<Object, Object> opsForZSet() {
        return opsForZSet(Object.class, Object.class);
    }

    default <V> ZSetOperations<Object, V> opsForZSet(Class<V> valueType) {
        return opsForZSet(Object.class, valueType);
    }

    <K, V> ZSetOperations<K, V> opsForZSet(Class<K> keyType, Class<V> valueType);

    <K, V> ZSetOperations<K, V> opsForZSet(int db, Class<K> keyType, Class<V> valueType);

    @Override
    default BoundZSetOperations<Object, Object> boundZSetOps(Object key) {
        return null;
    }

    @Override
    default RedisSerializer<?> getKeySerializer() {
        return null;
    }

    @Override
    default RedisSerializer<?> getValueSerializer() {
        return null;
    }

    @Override
    default RedisSerializer<?> getHashKeySerializer() {
        return null;
    }

    @Override
    default RedisSerializer<?> getHashValueSerializer() {
        return null;
    }
}
