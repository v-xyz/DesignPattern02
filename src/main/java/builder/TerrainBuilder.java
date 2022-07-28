package builder;
//Terrain 地形 构建的接口
public interface TerrainBuilder {
    TerrainBuilder buildWall();
    TerrainBuilder buildFort(); //构建堡垒
    TerrainBuilder buildMine(); //构建地雷
    Terrain build();
}
