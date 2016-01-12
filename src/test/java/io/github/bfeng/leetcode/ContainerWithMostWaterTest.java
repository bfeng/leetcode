package io.github.bfeng.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bfeng on 1/8/16.
 */
public class ContainerWithMostWaterTest {

    ContainerWithMostWater solution;

    @Before
    public void setUp() throws Exception {
        solution = new ContainerWithMostWater();
    }

    @Test
    public void testMaxAreaCase1() throws Exception {
        int[] input = new int[]{1, 2, 13, 14, 5, 6};
        assertEquals(18, solution.maxArea(input));
    }

    @Test
    public void testMaxAreaCase2() throws Exception {
        int[] input = new int[]{
                9384, 887, 2778, 6916, 7794, 8336, 5387, 493, 6650, 1422, 2363, 28, 8691, 60, 7764, 3927, 541, 3427,
                9173, 5737, 5212, 5369, 2568, 6430, 5783, 1531, 2863, 5124, 4068, 3136, 3930, 9803, 4023, 3059, 3070,
                8168, 1394, 8457, 5012, 8043, 6230, 7374, 4422, 4920, 3785, 8538, 5199, 4325, 8316, 4371, 6414, 3527,
                6092, 8981, 9957, 1874, 6863, 9171, 6997, 7282, 2306, 926, 7085, 6328, 337, 6506, 847, 1730, 1314,
                5858, 6125, 3896, 9583, 546, 8815, 3368, 5435, 365, 4044, 3751, 1088, 6809, 7277, 7179, 5789, 3585,
                5404, 2652, 2755, 2400, 9933, 5061, 9677, 3369, 7740, 13, 6227, 8587, 8095, 7540, 796, 571, 1435,
                379, 7468, 6602, 98, 2903, 3318, 493, 6653, 757, 7302, 281, 4287, 9442, 3866, 9690, 8445, 6620, 8441,
                4730, 8032, 8118, 8098, 5772, 4482, 676, 710, 8928, 4568, 7857, 9498, 2354, 4587, 6966, 5307, 4684,
                6220, 8625, 1529, 2872, 5733, 8830, 9504, 20, 8271, 3369, 9709, 6716, 6341, 8150, 7797, 724, 2619,
                2246, 2847, 3452, 2922, 3556, 2380, 7489, 7765, 8229, 9842, 2351, 5194, 1501, 7035, 7765, 125, 4915,
                6988, 5857, 3744, 6492, 2228, 8366, 9860, 1937, 1433, 2552, 6438, 9229, 3276, 5408, 1475, 6122, 8859,
                4396, 6030, 1238, 8236, 3794, 5819, 4429, 6144, 1012, 5929, 9530, 8777, 2405, 4444, 5764, 4614, 4539,
                8607, 6841, 2905, 4819, 5129, 689, 7370, 7918, 9918, 6997, 3325, 7744, 9471, 2184, 8491, 5500, 9773,
                6726, 5645, 5591, 7506, 8140, 2955, 9787, 7670, 8083, 8543, 8465, 198, 9508, 9356, 8805, 6349, 8612,
                3623, 7829, 9300, 7344, 5747, 5569, 4341, 5423, 3312, 3811, 7606, 1802, 5662, 3731, 4879, 1306, 9321,
                8737, 9445, 8627, 8523, 3466, 6709, 3417, 8283, 3259, 2925, 7638, 2063, 5625, 2601, 2037, 3453, 1900,
                9380, 5551, 7469, 72, 974, 7132, 3882, 4931, 8934, 5895, 8661, 164, 7200, 7982, 8900, 2997, 2960,
                3774, 2814, 9669, 7191, 1096, 2927, 6467, 5085, 1341, 2091, 7685, 3377, 5543, 5937, 9108, 7446, 9757,
                9180, 8419, 6888, 9413, 3349, 2173, 1660, 2010, 2337, 5211, 6343, 7588, 8207, 9302, 7714, 7373, 5322,
                1256, 4820, 4600, 7722, 9905, 5940, 9812, 3941, 5668, 1706, 6229, 1128, 9151, 5985, 6659, 3921, 9225,
                2423, 7270, 1397, 4082, 5631, 85, 9293, 1973, 7673, 3851, 7626, 5386, 1223, 9300, 6641, 6043, 3899,
                714, 2299, 6191, 525, 2591, 8210, 8582, 8820, 9337, 7733, 1156, 5995, 8005, 380, 4770, 5274, 1777,
                8851, 7256, 1861, 8143, 5580, 5885, 1994, 3206, 7622, 9568, 2505, 614, 1962, 2755, 1327, 4260, 8945,
                8203, 3203, 3507, 6785, 2022, 2843, 869, 9529, 5190, 8873, 9909, 9959, 499, 8037, 8809, 7754, 6249,
                3304, 3334, 2134, 1649, 2891, 9755, 7568, 1747, 369, 9530, 4501, 8047, 3789, 9798, 6250, 6991, 3304,
                3034, 5364, 2498, 254, 4893, 7687, 9126, 1153, 3997, 5976, 9189, 9158, 3730, 5437, 2461, 3415, 3922,
                461, 6305, 29, 8028, 8051, 6749, 7557, 8903, 4795, 7698, 8700, 1044, 1040, 2003, 429, 6404, 4501,
                682, 7648, 8539, 6160, 5152, 2536, 2135, 4340, 1693, 2216, 6128, 505, 5630, 50, 965, 8286, 6430,
                5344, 6336, 3178, 2901, 5239, 7972, 6950, 290, 5368, 7989, 2293, 5796, 744, 3145, 2830, 8391, 1683,
                5341, 3542, 570, 3827, 4233, 2262, 6043, 361, 9118, 8024, 6762, 82, 6310, 3191, 5426, 8997, 6368,
                4678, 4235, 691, 1627, 4525, 6058, 9615, 3169, 8206, 359, 6313, 7387, 5101, 4347, 2727, 4995, 4917,
                6553, 5579, 3530, 8947, 2291, 2648, 6971, 9052, 9081, 9632, 8594, 858, 8628, 1313, 1887, 9215, 8356,
                3513, 91, 4413, 9480, 9611, 8970, 6190, 2275, 6356, 7642, 6621, 5434, 8988, 7889, 8339, 4567, 7771,
                7285, 6857, 418, 607, 2261, 5850, 238, 7206, 3060, 5218, 8519, 4946, 784, 6874, 8459, 874, 7638,
                4290, 484, 6608, 479, 2758, 9315, 4472, 5730, 1101, 3460, 3619, 9439, 8026, 1389, 3075, 1234, 8158,
                3682, 3494, 359, 271, 700, 3418, 1840, 5570, 8364, 2623, 8795, 3174, 9848, 6432, 7463, 6683, 9391,
                4293, 5792, 5058, 5116, 1522, 6158, 8575, 1492, 1948, 2952, 9232, 5022, 538, 3741, 5055, 4031, 4099,
                5326, 1082, 7517, 3517, 3003, 2232, 6140, 1797, 5405, 2339, 4581, 9219, 9022, 3971, 9863, 4813, 5380,
                4978, 2686, 1537, 9905, 4177, 3484, 9208, 9760, 4858, 9745, 3500, 9912, 128, 3951, 5237, 7561, 7819,
                5106, 564, 50, 1245, 8712, 1806, 9935, 3292, 7376, 8956, 3615, 3590, 3769, 8994, 4919, 2806, 6883,
                4823, 6983, 6718, 4031, 3094, 1575, 127, 6594, 1487, 254, 544, 3075, 7815, 4714, 8180, 8378, 4763,
                5776, 7089, 2920, 5711, 6733, 295, 1018, 347, 236, 1138, 5692, 5154, 3944, 2574, 6329, 926, 9292,
                6711, 4019, 7218, 6837, 6964, 5056, 7091, 3859, 8131, 4905, 8572, 2662, 9634, 9686, 4790, 3074, 2605,
                6852, 9806, 9251, 7869, 6504, 9486, 9007, 2196, 4640, 2950, 1121, 968, 227, 6764, 7678, 597, 3982,
                866, 7561, 9037, 7956, 7771, 3519, 9212, 6343, 2533, 5197, 2380, 7322, 8271, 4985, 4173, 4428, 4235,
                2041, 7284, 73, 7399, 5831, 1064, 348, 6951, 2031, 574, 3715, 6060, 7523, 4048, 6925, 5083, 9436,
                1233, 9205, 2955, 444, 1899, 5487, 5641, 4279, 9160, 263, 9263, 9684, 1042, 9849, 1724, 8325, 6273,
                9123, 4155, 7336, 5822, 7458, 9366, 2748, 1172, 1777, 270, 5219, 8702, 1704, 4654, 9934, 908, 3960,
                6729, 2807, 5798, 8721, 7085, 1309, 5335, 2699, 992, 6377, 8899, 2716, 1053, 5172, 8190, 1560, 2507,
                4011, 9017, 8225, 3110, 6540, 1, 3379, 8110, 5054, 5082, 9115, 1339, 5990, 9427, 8068, 5148, 5224,
                6788, 2232, 6533, 2123, 1282, 3876, 4851, 180, 6591, 2255, 5351, 1132, 3814, 7858, 1495, 9182, 6082,
                4604, 5721, 2434, 7983, 182, 7488, 9416, 9297, 8826, 5405, 8723, 6893, 552, 298, 33, 9135, 3182,
                8507, 416, 7058, 9709, 596, 10000, 1963, 2298, 7484, 5777, 155, 8978, 1310, 2588, 9933, 3383, 5022,
                4267, 3564, 8861, 3683, 9212, 7686, 9087, 4286, 931, 5991, 4584, 7315, 1477, 4117, 5821, 1893, 7526,
                5529, 8840, 7526, 7491, 1137, 1361, 9619, 7644, 338, 929, 6583, 6622, 4311, 7956, 889, 4226, 6816,
                4571, 3438, 854, 9, 7723, 1784, 2351, 8658, 9098, 3828, 9127, 1270, 2072, 6652, 3150, 911, 529, 640,
                8399, 1889, 6611, 2394, 8578, 3891, 8977, 5200, 4553, 6932, 6088, 8778, 100, 658, 8567, 953, 7018,
                2642, 2736, 9369, 1299, 8185, 3196, 6777, 5806, 5267, 3429, 8955, 2529, 309, 9594, 7279, 2198, 2556,
                9673, 775, 6446, 5001, 2326, 998, 8284, 8413, 6128, 8383, 5422, 4694, 9335, 2440, 7335, 8422, 8160,
                4986, 2958, 1355, 1762, 8763, 2973, 1542, 7717, 1853, 1851, 3663, 5483, 400, 6218, 5155, 1174, 9016,
                6507, 9852, 6365, 4791, 8264, 2492, 3173, 38, 3538, 8860, 8829, 872, 7281, 6988, 5857, 6591, 8342,
                3971, 5353, 7666, 5512, 3070, 9518, 7362, 3084, 1352, 4113, 9301, 6507, 1639, 4668, 9365, 1490, 1033,
                4155, 6105, 9876, 3680, 6142, 3413, 2539, 4970, 637, 6171, 1957, 2845, 2761, 6650, 6815, 4466, 4315,
                2327, 3887, 184, 6040, 6970, 1536, 153, 2622, 4394, 1791, 7290, 110, 9632, 4674, 4265, 5736, 4549,
                4296, 1878, 4314, 6834, 3199, 4950, 9356, 5156, 7794, 8469, 8157, 961, 2934, 8824, 3287, 3172, 5359,
                5678, 141, 3246, 2182, 2762, 3991, 324, 51, 4101, 9955, 1076, 8365, 2043, 5625, 2660, 3920, 6290,
                5845, 3470, 1239, 1552, 4977, 5384, 20, 3134, 6344, 9305, 1957, 5982, 2476, 3667, 8012, 8968, 6913,
                193, 1730, 903, 6869, 8132, 5003, 3175, 9208, 9719, 5217, 1184, 2378, 5488, 7473, 4574, 8958, 5063,
                6126, 3934, 6798, 2497, 3419, 3142, 8154, 1727, 5475, 6981, 5394, 3486, 5949, 2306, 31, 4030, 9560,
                6899, 2161, 4563, 6425, 7720, 4281, 1642, 8903, 3011, 3481, 2727, 7584, 8790, 4141, 3709, 2724, 939,
                2558, 2494, 432, 711, 4221, 5906, 7691, 9614, 9392, 3639, 8271, 9422, 7668, 7830, 2672, 6181, 8744,
                9096, 3900, 3025, 7089, 9155, 2387, 570, 8233, 9970, 5711, 2374, 31, 8434, 9664, 2588, 7280, 95,
                9650, 1500, 2352, 7340, 7465, 1743, 7331, 2087, 7516, 1350, 9916, 187, 3882, 5012, 5635, 4134, 4388,
                2723, 3288, 6774, 9644, 1520, 6743, 5355, 245, 3125, 140, 6260, 2064, 7419, 6354, 1713, 5270, 8706,
                5405, 2734, 6800, 2735, 4820, 4316, 436, 1088, 854, 670, 2451, 6488, 4803, 6838, 5563, 8090, 3611,
                5206, 5961, 6705, 6912, 2558, 9830, 3404, 8817, 1893, 822, 1523, 3606, 2444, 6580, 5362, 1529, 3379,
                4448, 2701, 4046, 4883, 3788, 4900, 5552, 2590, 1387, 354, 9427, 6949, 4795, 3037, 8507, 7108, 6093,
                5418, 9665, 5922, 8821, 8481, 4167, 5995, 6355, 4124, 8438, 2934, 9485, 6318, 6313, 3932, 9018, 6710,
                5166, 9157, 1609, 7070, 1746, 2996, 7423, 1172, 6296, 8570, 560, 4802, 5677, 6653, 6572, 5341, 8926,
                1744, 173, 3092, 4090, 6528, 3567, 8879, 5813, 3051, 5197, 2125, 3334, 4214, 5187, 8500, 3371, 6795,
                5569, 5116, 6142, 9343, 2640, 2438, 4264, 3199, 3591, 9940, 6203, 6514, 1632, 5129, 8258, 1805, 4572,
                2347, 4684, 8139, 1226, 496, 7541, 6422, 8973, 7227, 635, 4159, 5726, 357, 953, 7646, 5473, 3447,
                3340, 8112, 5884, 7604, 7662, 5826, 7543, 217, 2340, 9175, 5345, 597, 7331, 6268, 9295, 2014, 758,
                520, 8861, 4651, 3293, 7833, 1877, 280, 1991, 3954, 636, 9296, 1599, 6108, 2742, 4938, 571, 4977,
                2541, 4585, 802, 84, 4801, 9493, 5610, 6497, 6441, 2940, 2764, 5736, 1305, 9874, 2607, 165, 4524,
                2252, 4350, 2752, 2531, 6340, 6705, 3166, 1987, 8303, 5626, 1080, 9592, 2548, 2408, 8485, 7132, 9562,
                4920, 1932, 9054, 529, 8428, 5495, 9820, 7544, 7582, 1124, 3769, 188, 7640, 4644, 2439, 1989, 7395,
                1321, 4681, 4099, 4487, 3019, 8753, 6464, 4099, 4696, 9011, 6506, 3180, 6143, 6067, 8099, 4426, 1473,
                4979, 2854, 6967, 4798, 6749, 4548, 2273, 517, 1087, 9913, 5160, 9878, 1901, 2554, 1198, 2933, 3004,
                2036, 5952, 8108, 8499, 50, 9155, 3862, 2907, 2335, 4, 5326, 6785, 4429, 6798, 1764, 3634, 116, 6561,
                382, 1015, 5186, 898, 2101, 5098, 2409, 8330, 3350, 1314, 5880, 2635, 4317, 7915, 8586, 8776, 2766,
                4987, 7931, 6627, 7893, 6617, 6630, 9570, 9753, 7410, 6367, 1516, 7396, 2834, 4429, 7777, 3848, 9614,
                5027, 2301, 1063, 3787, 630, 764, 5101, 6509, 3398, 9417, 776, 1983, 4545, 3541, 3321, 8827, 6519,
                7566, 1795, 9500, 7135, 1547, 6909, 9854, 3063, 4304, 2687, 3843, 8433, 6535, 9808, 9811, 8835, 870,
                3597, 5816, 7985, 8697, 2325, 1383, 4466, 9452, 9717, 5362, 9344, 3038, 4188, 5862, 603, 5982, 5361,
                4089, 3880, 8621, 3942, 3294, 2925, 6629, 7136, 7709, 3163, 6943, 3871, 1997, 4164, 7467, 7812, 8501,
                2516, 6488, 6235, 3333, 2291, 5951, 8694, 1634, 5340, 2881, 7495, 2294, 5214, 2855, 6383, 5445, 1476,
                324, 8739, 752, 6952, 5874, 4812, 6466, 9169, 8682, 4814, 9684, 2500, 8978, 4536, 5015, 5465, 770,
                8347, 4108, 3073, 3392, 5741, 8412, 2624, 9588, 7058, 7837, 8794, 3440, 3282, 6621, 115, 8372, 7372,
                3419, 597, 8535, 9884, 9765, 3568, 4698, 5801, 6068, 3675, 336, 7434, 5491, 7458, 2133, 5950, 530,
                5524, 1691, 5293, 8148, 7630, 2350, 2336, 6423, 2141, 1969, 3044, 2256, 340, 6767, 2026, 937, 1654,
                8261, 7053, 5221, 2958, 9205, 1288, 2984, 9541, 8722, 4827, 6998, 7206, 7128, 3879, 2729, 5170, 9171,
                7228, 2799, 1521, 9564, 9222, 3661, 7884, 8617, 2268, 8224, 5383, 4293, 5512, 7036, 2554, 2564, 8609,
                1863, 1769, 9896, 1199, 7661, 4969, 2377, 1010, 2174, 9504, 4888, 1255, 4674, 4058, 8482, 3824, 1930,
                4397, 3045, 1943, 2281, 8013, 4210, 6856, 9748, 4855, 2367, 3135, 3760, 1282, 1743, 1974, 9402, 1639,
                3172, 3414, 2959, 1900, 4423, 1485, 7756, 5662, 9091, 8781, 6072, 3924, 2604, 8001, 8321, 2001, 9943,
                6953, 13, 505, 3808, 9760, 5359, 2526, 2895, 9118, 159, 4637, 1091, 9561, 2627, 615, 2974, 1938,
                8866, 3749, 3422, 6621, 9410, 8864, 5401, 1833, 2787, 8005, 9834, 7459, 6357, 6128, 4411, 6369, 6632,
                4570, 6129, 8342, 3447, 5375, 7459, 3606, 11, 4902, 3166, 8990, 1868, 2491, 927, 733, 6239, 700,
                3706, 2001, 9563, 5458, 3833, 2349, 3462, 18, 9808, 6170, 2498, 570, 2539, 9129, 5140, 5019, 7471,
                8586, 393, 1281, 8543, 6755, 2534, 1708, 5744, 4401, 551, 3022, 1486, 6789, 3721, 5191, 5141, 9635,
                648, 5326, 1984, 462, 1695, 8143, 6631, 4192, 5064, 5521, 3321, 6555, 539, 7143, 1493, 931, 8423, 35,
                7686, 7309, 8095, 9781, 1709, 8645, 2803, 9546, 1785, 6523, 1088, 6926, 6158, 1736, 8603, 4493, 8549,
                297, 8987, 1531, 841, 4050, 7052, 513, 6957, 7590, 7655, 8449, 4873, 2429, 8483, 2558, 6089, 6577,
                2338, 7798, 5221, 5140, 3695, 7006, 8015, 4783, 283, 524, 2870, 5237, 5016, 1418, 1885, 354, 9300,
                2725, 755, 6351, 3237, 7711, 293, 7243, 6159, 5165, 6024, 4642, 7722, 2112, 7570, 6411, 6261, 2791,
                7903, 9956, 6148, 5917, 1090, 2782, 6440, 3959, 8018, 7807, 5376, 9902, 4512, 4675, 8979, 5266, 7378,
                8567, 2977, 7670, 2162, 9135, 2834, 4537, 128, 6907, 3000, 7698, 3317, 9261, 6840, 7571, 5568, 2987,
                3487, 3009, 5768, 6278, 6967, 137, 436, 8694, 38, 4947, 9720, 5368, 213, 7097, 3935, 9541, 1118,
                6096, 8675, 3951, 632, 8803, 7209, 3631, 2852, 526, 9243, 9691, 4448, 1162, 2677, 7935, 4170, 4796,
                564, 1136, 4932, 7352, 6181, 1321, 2298, 5901, 6689, 8862, 2997, 6975, 8402, 4115, 3070, 3429, 4417,
                53, 8583, 1626, 3683, 1434, 8503, 9278, 1124, 2950, 6791, 152, 7236, 961, 4947, 7800, 8448, 6230,
                1503, 4629, 7550, 3800, 529, 590, 9014, 9877, 7564, 3767, 3991, 6985, 7195, 4760, 7037, 5777, 6385,
                7072, 7210, 1239, 2701, 4685, 540, 9491, 4836, 7776, 451, 9782, 1927, 5251, 2363, 3429, 9879, 6265,
                3580, 6759, 6854, 8945, 6635, 770, 2712, 6978, 4106, 6258, 1737, 1143, 2035, 4473, 4566, 5596, 5711,
                7266, 6633, 6250, 3108, 1468, 377, 3559, 7602, 2303, 5161, 9964, 2083, 5039, 6228, 2015, 1797, 9434,
                959, 8431, 6555, 3670, 5408, 660, 9928, 3496, 1802, 8314, 7968, 2719, 261, 30, 6336, 6893, 2632,
                9444, 4713, 3008, 9354, 2314, 1663, 4514, 8629, 97, 9552, 4857, 2111, 7700, 642, 3070, 2482, 7196,
                3091, 7890, 7855, 9370, 7737, 6009, 7683, 5705, 8727, 4296, 5734, 1415, 1188, 8365, 858, 2252, 7725,
                211, 4565, 5739, 4724, 3194, 5835, 627, 4402, 7946, 8326, 1395, 7367, 807, 8590, 457, 5048, 2796,
                9827, 2785, 8804, 3861, 4841, 3883, 8156, 574, 1649, 5696, 5291, 2506, 7947, 9367, 9068, 8864, 5105,
                3791, 8409, 7291, 769, 9162, 5236, 9094, 556, 2602, 6252, 9145, 9411, 7652, 8292, 5589, 436, 3448,
                9449, 5276, 3682, 3957, 2201, 5330, 9652, 3843, 7835, 3950, 9561, 6902, 9165, 4665, 7044, 7573, 1956,
                7812, 6734, 3543, 3257, 3641, 2497, 5860, 9137, 8259, 3511, 7429, 3847, 298, 876, 3295, 1925, 4557,
                7251, 4126, 9886, 3254, 4320, 4072, 3556, 3881, 7325, 2720, 4897, 4368, 6645, 3204, 8531, 9730, 6747,
                1787, 3371, 5595, 7646, 8859, 3853, 7509, 6287, 7699, 7806, 3514, 7345, 9731, 4422, 948, 208, 659,
                4201, 879, 4730, 4108, 4759, 2054, 3180, 6008, 2773, 6176, 9211, 1303, 5905, 2309, 9441, 5627, 7903,
                7087, 4486, 8107, 947, 7124, 5805, 8752, 638, 9502, 4834, 1411, 449, 1393, 2070, 1001, 2272, 3151,
                5109, 3382, 1557, 8288, 9389, 4329, 4463, 4952, 1984, 6719, 7260, 1424, 2346, 1515, 4862, 3183, 5973,
                5808, 6658, 8130, 912, 7295, 7631, 5745, 5058, 8079, 7138, 7127, 9079, 5761, 6629, 4187, 9142, 8185,
                8826, 4883, 8866, 9640, 9834, 849, 6359, 3445, 8624, 5056, 1311, 3486, 4590, 7284, 5645, 1247, 5413
        };
        assertEquals(23115474, solution.maxArea(input));
    }
}