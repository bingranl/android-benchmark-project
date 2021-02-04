package com.android.example.module06_module313_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module313_module5.ClassAAC = com.android.example.module06_module313_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module313_module5.ClassAAD = com.android.example.module06_module313_module5.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module313_module5.ClassAAI = com.android.example.module06_module313_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module313_module5.ClassAAH,
		param1: com.android.example.module06_module313_module5.ClassAAH,
		param2: com.android.example.module06_module313_module5.ClassAAJ
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module313_module5.ClassAAB,
		param1: com.android.example.module06_module313_module5.ClassAAG,
		param2: com.android.example.module06_module313_module5.ClassAAI,
		param3: com.android.example.module06_module313_module5.ClassAAA
	) {
		val local_var_2_4: okio.Throttler = okio.Throttler()
		local_var_2_4.bytesPerSecond(4833877380295778351, -4695948290104042181, -6745966724874131630)

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.exit()

	}

	fun method2(
		param0: com.android.example.module06_module313_module5.ClassAAJ,
		param1: com.android.example.module06_module313_module5.ClassAAC,
		param2: com.android.example.module06_module313_module5.ClassAAB,
		param3: com.android.example.module06_module313_module5.ClassAAE
	) {
		val local_var_2_4: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_4.enter()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.observers.TestObserver())

		val local_var_2_5: okio.AsyncTimeout = okio.AsyncTimeout()
		local_var_2_5.exit()

	}
}
