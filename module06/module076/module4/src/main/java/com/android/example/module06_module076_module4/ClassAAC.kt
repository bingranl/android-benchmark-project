package com.android.example.module06_module076_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module076_module5.ClassAAC = com.android.example.module06_module076_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module076_module1.ClassAAB = com.android.example.module06_module076_module1.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module076_module1.ClassAAD,
		param1: com.android.example.module06_module076_module5.ClassAAI
	) {
		for (iAb in 0..3) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.cancel()

			}
		}
		param0.method0(com.android.example.module06_module076_module5.ClassAAB())

		param0.method1(com.android.example.module06_module076_module5.ClassAAJ(), com.android.example.module06_module076_module5.ClassAAE(), com.android.example.module06_module076_module5.ClassAAI(), com.android.example.module06_module076_module5.ClassAAG())

		param0.method1(com.android.example.module06_module076_module5.ClassAAJ(), com.android.example.module06_module076_module5.ClassAAE(), com.android.example.module06_module076_module5.ClassAAI(), com.android.example.module06_module076_module5.ClassAAG())

	}

	fun method1(
		param0: com.android.example.module06_module076_module5.ClassAAD,
		param1: com.android.example.module06_module076_module5.ClassAAB,
		param2: com.android.example.module06_module076_module1.ClassAAC,
		param3: com.android.example.module06_module076_module1.ClassAAA
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isCancelled()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.assertNotSubscribed()

		val local_var_2_7: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_7.request(7742380563007743055)

	}

	fun method2(
		param0: com.android.example.module06_module076_module5.ClassAAA,
		param1: com.android.example.module06_module076_module1.ClassAAJ,
		param2: com.android.example.module06_module076_module5.ClassAAD
	) {
		param0.method0("SomeString", "SomeString")

		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.start()

	}
}
