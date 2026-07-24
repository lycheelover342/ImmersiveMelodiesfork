package immersive_melodies;

import java.util.Map;

import static net.minecraft.world.entity.Mob.DEFAULT_EQUIPMENT_DROP_CHANCE;

public final class Config extends JsonConfig {
    private static final Config INSTANCE = loadOrCreate();

    public static Config getInstance() {
        return INSTANCE;
    }

    @SuppressWarnings("unused")
    public String README = "https://github.com/Luke100000/ImmersiveMelodies/wiki/Config";

    public int bufferDelay = 75;
    public int maxAudibleDistance = 48;
    public float instrumentVolumeFactor = 1.0f;
    public float perceivedLoudnessAdjustmentFactor = 0.5f;

    public int humanizationTime = 20;         // absolute timing jitter in ms
    public float humanizationVolume = 0.06f;  // relative multiplier
    public float humanizationPitch = 0.02f;   // semitones
    public float humanizationLength = 0.04f;  // relative multiplier

    public Map<String, Float> mobInstrumentFactors = Map.of(
            "minecraft:zombie", 0.01f,
            "minecraft:husk", 0.01f,
            "minecraft:skeleton", 0.01f,
            "minecraft:wither_skeleton", 0.01f,
            "minecraft:piglin_brute", 0.01f,
            "minecraft:piglin", 0.01f,
            "minecraft:zombified_piglin", 0.01f,
            "minecraft:pillager", 0.01f
    );
    public float mobInstrumentDropFactor = DEFAULT_EQUIPMENT_DROP_CHANCE;

    public boolean showOtherPlayersMelodies = true;
    public boolean forceMobsToPickUp = true;
    public boolean clickedHelp = false;
    public boolean loadInbuiltMidis = true;
    public boolean stopGameMusicForPlayers = true;
    public boolean stopGameMusicForMobs = false;
    public int uploadPermissionLevel = 0;
    public int rightClickToDropEntityInstrumentPermissionLevel = 0;

    public Map<Integer, Integer> keycodeToMidi = Map.ofEntries(
            Map.entry(90, 60),  // Z -> C4
            Map.entry(83, 61),  // S -> C#4
            Map.entry(88, 62),  // X -> D4
            Map.entry(68, 63),  // D -> D#4
            Map.entry(67, 64),  // C -> E4
            Map.entry(86, 65),  // V -> F4
            Map.entry(71, 66),  // G -> F#4
            Map.entry(66, 67),  // B -> G4
            Map.entry(72, 68),  // H -> G#4
            Map.entry(78, 69),  // N -> A4
            Map.entry(74, 70),  // J -> A#4
            Map.entry(77, 71),  // M -> B4
            Map.entry(81, 72),  // Q -> C5
            Map.entry(50, 73),  // 2 -> C#5
            Map.entry(87, 74),  // W -> D5
            Map.entry(51, 75),  // 3 -> D#5
            Map.entry(69, 76),  // E -> E5
            Map.entry(82, 77),  // R -> F5
            Map.entry(53, 78),  // 5 -> F#5
            Map.entry(84, 79),  // T -> G5
            Map.entry(54, 80),  // 6 -> G#5
            Map.entry(89, 81),  // Y -> A5
            Map.entry(55, 82),  // 7 -> A#5
            Map.entry(85, 83),  // U -> B5
            Map.entry(73, 84),  // I -> C6
            Map.entry(57, 85),  // 9 -> C#6
            Map.entry(79, 86),  // O -> D6
            Map.entry(48, 87),  // 0 -> D#6
            Map.entry(80, 88),  // P -> E6
            Map.entry(219, 89)  // [ -> F6
    );

}
