package com.android.example.module06_module333_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAD = com.android.example.module06_module333_module5.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAI = com.android.example.module06_module333_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAF,
		param1: com.android.example.module06_module333_module5.ClassAAI,
		param2: com.android.example.module06_module333_module5.ClassAAA,
		param3: com.android.example.module06_module333_module5.ClassAAA
	) {
		listOf("1", "2", "3").forEach {
			param0.method2(io.reactivex.subscribers.TestSubscriber())

		}
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.request(6448027673007692884)

		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAH,
		param1: com.android.example.module06_module333_module5.ClassAAG,
		param2: com.android.example.module06_module333_module5.ClassAAE,
		param3: com.android.example.module06_module333_module5.ClassAAF
	) {
		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

	}
}
