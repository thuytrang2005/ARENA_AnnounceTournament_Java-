# ARENA - AnnounceTournament

## Phạm vi

Đây là bản hiện thực hóa giả lập đơn giản cho UC `AnnounceTournament`
dựa trực tiếp trên use-case diagram ARENA được cung cấp.

Trong sơ đồ:
- `LeagueOwner` là actor khởi tạo (`<<initiate>>`) `AnnounceTournament`.
- `Advertiser` tham gia (`<<participate>>`) `AnnounceTournament`.
- `Player` và `Spectator` thuộc mô hình ARENA tổng thể nhưng không có xử lý
  trực tiếp trong UC `AnnounceTournament`, nên chỉ được mô hình hóa tối giản.

## Mô hình BCE

### Boundary
- `AnnounceTournamentForm`
- `AnnouncementResult`

### Control
- `AnnounceTournamentControl`

### Entity
- `Tournament`
- `LeagueOwner`
- `Advertiser`
- `Player`
- `Spectator`

## Luồng giả lập

1. `LeagueOwner` nhập thông tin giải đấu qua `AnnounceTournamentForm`.
2. `AnnounceTournamentControl` kiểm tra dữ liệu.
3. Control tạo entity `Tournament`.
4. Nếu có `Advertiser`, advertiser được gắn với tournament.
5. Control trả về `AnnouncementResult`.
6. `Main` in kết quả ra console.

## Biên dịch

Yêu cầu JDK 17 trở lên.

```bash
javac -d out ARENA_AnnounceTournament/src/arena/*.java
java -cp out arena.Main
```

Không sử dụng thư viện bên ngoài, database hay giao diện đồ họa.
