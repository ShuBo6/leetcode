package src

import "testing"

func decodeMessage(key string, message string) string {
	var hash = map[int32]int32{}
	hash[' '] = ' '
	idx := 'a'
	for _, b := range key {
		if b == ' ' {
			continue
		}
		if _, ok := hash[b]; ok {
			continue
		}
		hash[b] = idx
		idx++
	}
	var ret []byte
	for _, b := range message {
		ret = append(ret, byte(hash[b]))
	}
	return string(ret)
}
func TestDecodeMessage(t *testing.T) {
	key := "the quick brown fox jumps over the lazy dog"
	message := "vkbs bs t suepuv"
	t.Log(decodeMessage(key, message))
}
